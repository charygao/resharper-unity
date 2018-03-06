package com.jetbrains.rider.plugins.unity.run.configurations;

import com.intellij.ui.HyperlinkLabel;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class UnityAttachToEditorFormLayout {
    protected JPanel rootPanel;
    protected HyperlinkLabel downloadLabel;
    protected JLabel editorInstanceJsonError;
    protected JLabel processIdInfo;
    protected JPanel editorInstanceJsonErrorPanel;
    protected ProcessesPanel processesList;
    protected JPanel editorInstanceJsonInfoPanel;
    protected JTextField textField1;

    @NotNull
    public JPanel getPanel() {
        return rootPanel;
    }

    private void createUIComponents() {
        downloadLabel = new HyperlinkLabel();
        downloadLabel.setAlignmentX(-2);
        downloadLabel.setIconTextGap(0);
        downloadLabel.setHyperlinkText("", "Unity Editor plugin", " is required for the \"Attach to Unity Editor\" run configuration to work.");
        downloadLabel.setHyperlinkTarget("https://github.com/JetBrains/resharper-unity#unity-editor-plugin");
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        rootPanel = new JPanel();
        rootPanel.setLayout(new GridLayoutManager(6, 1, new Insets(0, 0, 0, 0), -1, -1));
        editorInstanceJsonErrorPanel = new JPanel();
        editorInstanceJsonErrorPanel.setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), -1, -1));
        rootPanel.add(editorInstanceJsonErrorPanel, new GridConstraints(0, 0, 3, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        editorInstanceJsonError = new JLabel();
        editorInstanceJsonError.setText("EditorInstance Error");
        editorInstanceJsonErrorPanel.add(editorInstanceJsonError, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        editorInstanceJsonErrorPanel.add(downloadLabel, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        editorInstanceJsonErrorPanel.add(spacer1, new GridConstraints(2, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 25), new Dimension(-1, 25), new Dimension(-1, 25), 1, false));
        processesList = new ProcessesPanel();
        rootPanel.add(processesList, new GridConstraints(4, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        editorInstanceJsonInfoPanel = new JPanel();
        editorInstanceJsonInfoPanel.setLayout(new GridLayoutManager(2, 1, new Insets(0, 0, 0, 0), -1, -1));
        rootPanel.add(editorInstanceJsonInfoPanel, new GridConstraints(3, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        processIdInfo = new JLabel();
        processIdInfo.setText("Using process...");
        editorInstanceJsonInfoPanel.add(processIdInfo, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        editorInstanceJsonInfoPanel.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, new Dimension(-1, 25), new Dimension(-1, 25), new Dimension(-1, 25), 0, false));
        textField1 = new JTextField();
        textField1.setEnabled(false);
        textField1.setVisible(false);
        rootPanel.add(textField1, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}