package br.edu.ifsp.dmo.sitesfavoritos.ui.listeners

import br.edu.ifsp.dmo.sitesfavoritos.data.model.Site

interface SiteItemClickListener {

    fun clickSiteItem(site: Site)

    fun clickHeartSiteItem(site: Site)

    fun clickRemoveSiteItem(site: Site)
}