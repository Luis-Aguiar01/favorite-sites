package br.edu.ifsp.dmo.sitesfavoritos.data.model

class Site(var nickname: String, var url: String) {
    companion object {
        var nextId = 0
    }

    var favorite = false
    val id: Int = nextId

    init {
        nextId++
    }
}