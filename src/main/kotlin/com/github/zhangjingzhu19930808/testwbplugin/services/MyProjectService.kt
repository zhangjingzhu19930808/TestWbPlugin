package com.github.zhangjingzhu19930808.testwbplugin.services

import com.intellij.openapi.project.Project
import com.github.zhangjingzhu19930808.testwbplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
