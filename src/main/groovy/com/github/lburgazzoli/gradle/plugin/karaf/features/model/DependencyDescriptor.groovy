/**
 * Copyright 2016, Luca Burgazzoli and contributors as indicated by the @author tags
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.lburgazzoli.gradle.plugin.karaf.features.model

import org.gradle.api.artifacts.ResolvedArtifact
import org.gradle.api.artifacts.result.ResolvedComponentResult

/**
 * @author lburgazzoli
 */
class DependencyDescriptor extends Dependency {

    BundleDescriptor bundle

    DependencyDescriptor() {
        this.bundle = null;
    }

    DependencyDescriptor(ResolvedComponentResult component, ResolvedArtifact artifact, BundleDescriptor bundle) {
        super(component, artifact)
        this.bundle = bundle
    }
}
