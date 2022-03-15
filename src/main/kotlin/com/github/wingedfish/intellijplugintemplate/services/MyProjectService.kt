package com.github.wingedfish.intellijplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.wingedfish.intellijplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
