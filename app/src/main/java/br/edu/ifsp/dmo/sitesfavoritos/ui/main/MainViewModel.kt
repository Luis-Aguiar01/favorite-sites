package br.edu.ifsp.dmo.sitesfavoritos.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.edu.ifsp.dmo.sitesfavoritos.data.dao.SiteRepository
import br.edu.ifsp.dmo.sitesfavoritos.data.model.Site

class MainViewModel : ViewModel() {

    private val _sites = MutableLiveData<List<Site>>()
    val sites: LiveData<List<Site>>
        get() {
            return _sites
        }

    init {
       loadData()
    }

    fun addSite(site: Site) {
        SiteRepository.addSite(site)
        loadData()
    }

    fun removeSite(id: Int) {
        SiteRepository.remove(id)
        loadData()
    }

    private fun loadData() {
        _sites.value = SiteRepository.getAll()
    }
}