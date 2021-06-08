package com.github.jonathanpalumbo.waffleplugin.services

import com.github.jonathanpalumbo.waffleplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
