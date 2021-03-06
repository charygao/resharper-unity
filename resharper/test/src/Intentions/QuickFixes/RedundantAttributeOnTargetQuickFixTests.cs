﻿using JetBrains.ReSharper.FeaturesTestFramework.Intentions;
using JetBrains.ReSharper.Plugins.Unity.Feature.Services.QuickFixes;
using NUnit.Framework;

namespace JetBrains.ReSharper.Plugins.Unity.Tests.Intentions.QuickFixes
{
    [TestUnity]
    public class RedundantAttributeOnTargetQuickFixAvailabilityTests : QuickFixAvailabilityTestBase
    {
        protected override string RelativeTestDataPath=> @"Intentions\QuickFixes\RedundantAttributeOnTarget\Availability";

        [Test] public void TestRedundantAssemblyAttribute() { DoNamedTest2(); }
        [Test] public void TestRedundantClassAttribute() { DoNamedTest2(); }
        [Test] public void TestRedundantFieldAttribute() { DoNamedTest2(); }
        [Test] public void TestRedundantDelegateAttribute() { DoNamedTest2(); }
    }

    [TestUnity]
    public class RedundantAttributeOnTargetQuickFixRemoveTests : CSharpQuickFixTestBase<RedundantAttributeDeadCodeQuickFix>
    {
        protected override string RelativeTestDataPath=> @"Intentions\QuickFixes\RedundantAttributeOnTarget";

        [Test] public void TestRedundantAssemblyAttribute() { DoNamedTest2(); }
        [Test] public void TestRedundantClassAttribute() { DoNamedTest2(); }
        [Test] public void TestRedundantFieldAttribute() { DoNamedTest2(); }
        [Test] public void TestRedundantDelegateAttribute() { DoNamedTest2(); }
    }
}