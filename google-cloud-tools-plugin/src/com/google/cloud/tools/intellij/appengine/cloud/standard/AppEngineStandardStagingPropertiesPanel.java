/*
 * Copyright 2017 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.tools.intellij.appengine.cloud.standard;

import com.google.cloud.tools.intellij.appengine.cloud.AppEngineDeploymentConfiguration;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.jetbrains.annotations.NotNull;

public class AppEngineStandardStagingPropertiesPanel {

  private JTextField compileEncodingTextField;
  private JCheckBox deleteJspsCheckBox;
  private JCheckBox enableJarClassesCheckBox;
  private JCheckBox disableJarJspsCheckBox;
  private JCheckBox enableJarSplittingCheckBox;
  private JCheckBox enableQuickstartCheckBox;
  private JCheckBox disableUpdateCheckCheckBox;
  private JTextField jarSplittingExcludesTextField;
  private JPanel mainPanel;

  public JTextField getCompileEncodingTextField() {
    return compileEncodingTextField;
  }

  public JCheckBox getDeleteJspsCheckBox() {
    return deleteJspsCheckBox;
  }

  public JCheckBox getEnableJarClassesCheckBox() {
    return enableJarClassesCheckBox;
  }

  public JCheckBox getDisableJarJspsCheckBox() {
    return disableJarJspsCheckBox;
  }

  public JCheckBox getDisableUpdateCheckCheckBox() {
    return disableUpdateCheckCheckBox;
  }

  public JCheckBox getEnableQuickstartCheckBox() {
    return enableQuickstartCheckBox;
  }

  public JTextField getJarSplittingExcludesTextField() {
    return jarSplittingExcludesTextField;
  }

  public JCheckBox getEnableJarSplittingCheckBox() {
    return enableJarSplittingCheckBox;
  }

  public Component getMainPanel() {
    return mainPanel;
  }

  /**
   * Shared implementation of {@link
   * com.intellij.openapi.options.SettingsEditor#resetEditorFrom(Object)}. To be invoked by users of
   * this panel in the overriden method.
   */
  protected void resetEditorFrom(@NotNull AppEngineDeploymentConfiguration configuration) {
    compileEncodingTextField.setText(configuration.getCompileEncoding());
    deleteJspsCheckBox.setSelected(configuration.getDeleteJsps());
    disableJarJspsCheckBox.setSelected(configuration.getDisableJarJsps());
    disableUpdateCheckCheckBox.setSelected(configuration.getDisableUpdateCheck());
    enableJarClassesCheckBox.setSelected(configuration.getEnableJarClasses());
    enableJarSplittingCheckBox.setSelected(configuration.getEnableJarSplitting());
    enableQuickstartCheckBox.setSelected(configuration.getEnableQuickstart());
    jarSplittingExcludesTextField.setText(configuration.getJarSplittingExcludes());
  }

  /**
   * Shared implementation of {@link
   * com.intellij.openapi.options.SettingsEditor#applyEditorTo(Object)}. To be invoked by users of
   * this panel in the overriden method.
   */
  protected void applyEditorTo(@NotNull AppEngineDeploymentConfiguration configuration) {
    configuration.setCompileEncoding(compileEncodingTextField.getText());
    configuration.setDeleteJsps(deleteJspsCheckBox.isSelected());
    configuration.setDisableJarJsps(disableJarJspsCheckBox.isSelected());
    configuration.setDisableUpdateCheck(disableUpdateCheckCheckBox.isSelected());
    configuration.setEnableJarClasses(enableJarClassesCheckBox.isSelected());
    configuration.setEnableJarSplitting(enableJarSplittingCheckBox.isSelected());
    configuration.setEnableQuickstart(enableQuickstartCheckBox.isSelected());
    configuration.setJarSplittingExcludes(jarSplittingExcludesTextField.getText());
  }

}