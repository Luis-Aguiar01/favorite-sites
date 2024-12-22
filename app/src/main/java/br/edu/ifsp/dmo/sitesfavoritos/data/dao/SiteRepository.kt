package br.edu.ifsp.dmo.sitesfavoritos.data.dao

import br.edu.ifsp.dmo.sitesfavoritos.data.model.Site

object SiteRepository {
    private val sites: ArrayList<Site> = ArrayList()

    fun addSite(site: Site) {
        sites.add(site);
    }

    fun getAll() = ArrayList(sites)

    fun remove(id: Int) {
        sites.removeIf { site -> site.id == id }
    }
}