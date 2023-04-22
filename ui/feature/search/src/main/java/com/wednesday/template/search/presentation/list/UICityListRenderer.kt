package com.wednesday.template.presentation.weather.search.list

import android.view.ViewGroup
import com.wednesday.template.presentation.base.list.renderer.ListItemRenderer
import com.wednesday.template.presentation.base.list.viewholder.BaseViewHolder
import com.wednesday.template.presentation.weather.UICity
import com.wednesday.template.resources.databinding.CityItemListBinding

class UICityListRenderer : ListItemRenderer<UICity>() {
    override fun getViewHolder(viewGroup: ViewGroup): BaseViewHolder<UICity> {
        return UICityListViewHolder(
            binding = viewGroup bind CityItemListBinding::inflate
        )
    }
}
