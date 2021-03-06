using System;
using JetBrains.Application.Progress;
using JetBrains.ProjectModel;
using JetBrains.ReSharper.Feature.Services.QuickFixes;
using JetBrains.ReSharper.Intentions.Util;
using JetBrains.ReSharper.Plugins.Unity.CSharp.Daemon.Errors;
using JetBrains.ReSharper.Psi;
using JetBrains.ReSharper.Psi.CSharp.Tree;
using JetBrains.TextControl;
using JetBrains.Util;

namespace JetBrains.ReSharper.Plugins.Unity.Feature.Services.QuickFixes
{
    [QuickFix]
    public class InvalidReturnTypeFix : QuickFixBase
    {
        private readonly IMethodDeclaration myMethodDeclaration;
        private readonly MethodSignature myMethodSignature;

        public InvalidReturnTypeFix(InvalidReturnTypeWarning warning)
        {
            myMethodSignature = warning.ExpectedMethodSignature;
            myMethodDeclaration = warning.MethodDeclaration;
        }

        protected override Action<ITextControl> ExecutePsiTransaction(ISolution solution, IProgressIndicator progress)
        {
            var element = myMethodDeclaration.DeclaredElement;
            Assertion.AssertNotNull(element, "element != null");

            var language = myMethodDeclaration.Language;
            var changeTypeHelper = LanguageManager.Instance.GetService<IChangeTypeHelper>(language);
            changeTypeHelper.ChangeType(myMethodSignature.ReturnType, element);
            return null;
        }

        public override string Text => $"Change return type to '{myMethodSignature.GetReturnTypeName()}'";

        public override bool IsAvailable(IUserDataHolder cache)
        {
            return ValidUtils.Valid(myMethodDeclaration);
        }
    }
}