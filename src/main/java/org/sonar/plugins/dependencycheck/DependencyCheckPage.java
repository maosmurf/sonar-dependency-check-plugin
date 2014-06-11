/*
 * Sonar Dependency Check Plugin
 * Copyright (C) 2013 Porsche Informatik
 * dev@sonar.codehaus.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sonar.plugins.dependencycheck;

import org.sonar.api.resources.Qualifiers;
import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.NavigationSection;
import org.sonar.api.web.RequiredMeasures;
import org.sonar.api.web.ResourceQualifier;
import org.sonar.api.web.RubyRailsPage;

/**
 * Page showing the dependency check result.
 */
@RequiredMeasures(allOf = {DependencyCheckMetrics.DEPENDENCY_CHECK_DEPENDENCY_KEY, DependencyCheckMetrics.DEPENDENCY_CHECK_LICENSE_KEY})
@ResourceQualifier({Qualifiers.PROJECT, Qualifiers.MODULE})
@NavigationSection({NavigationSection.RESOURCE})
public class DependencyCheckPage extends AbstractRubyTemplate implements RubyRailsPage {

  public String getId() {
    return "org.sonar.plugins.dependencycheck.libraries";
  }

  public String getTitle() {
    return "Dependency Check";
  }

  @Override
  protected String getTemplatePath() {
    return "D:/workspace/sonar-dependency-check-plugin/src/main/resources/org/sonar/plugins/dependencycheck/DependencyCheckPage.html.erb";//"/org/sonar/plugins/dependencycheck/DependencyCheckPage.html.erb";
  }

}
