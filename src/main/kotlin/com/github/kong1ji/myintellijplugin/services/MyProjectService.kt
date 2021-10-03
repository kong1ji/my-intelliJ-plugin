package com.github.kong1ji.myintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.kong1ji.myintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
