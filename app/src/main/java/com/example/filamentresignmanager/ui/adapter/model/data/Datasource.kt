package com.example.filamentresignmanager.ui.adapter.model.data
import com.example.filamentresignmanager.adapter.model.data.Resin
import com.example.filamentresignmanager.R

class Datasource {
    fun loadResins(): MutableList<Resin> {
        return mutableListOf(
            Resin(
                name = "Sunlu",
                price = "27,15 €",
                type = "ABS-Like",
                color = "Grey",
                exposureTime = "3 seconds",
                firstLayerTime = "60 seconds",
                image = R.drawable.sunlu_abs_like
            ),
            Resin(
                name = "Sunlu",
                price = "24,34 €",
                type = "Standard Resin",
                color = "Transparent Blue",
                exposureTime = "2.3 seconds",
                firstLayerTime = "40 seconds",
                image = R.drawable.sunlu_standard_transparent_blue
            ),
            Resin(
                name = "Jayo",
                price = "31.99 €",
                type = "ABS-Like",
                color = "Black",
                exposureTime = "3 seconds",
                firstLayerTime = "60 seconds",
                image = R.drawable.jayo_abs_like_black
            )
        )

    }
}
