package com.wednesday.template.presentation.weather.search.list

import androidx.core.content.ContextCompat
import com.wednesday.template.presentation.base.intent.Intent
import com.wednesday.template.presentation.base.list.viewholder.BaseViewHolder
import com.wednesday.template.presentation.weather.UICity
import com.wednesday.template.presentation.weather.search.SearchScreenIntent
import com.wednesday.template.resources.R
import com.wednesday.template.resources.databinding.CityItemListBinding
import kotlinx.coroutines.channels.Channel

class UICityListViewHolder(private val binding: CityItemListBinding) :
    BaseViewHolder<UICity>(binding) {

    override fun onSetupIntents(intentChannel: Channel<Intent>) = with(binding) {
        imageViewFavourite.setOnClickListener {
            val value = SearchScreenIntent.ToggleFavourite(item)
            intentChannel.trySend(value)
        }
    }

    override fun onBindInternal() = binding.run {

        compareAndSet({ title to state }) {
            val title = it.first + if (it.second != null) ", ${it.second}" else ""
            cityTextViewListItem.text = title
        }

        compareAndSet({ latitude }) {
            latitudeTextViewListItem.text = it
        }

        compareAndSet({ isFavourite }) {
            val drawable = ContextCompat.getDrawable(
                root.context,
                if (it) R.drawable.ic_favorite else R.drawable.ic_favorite_border
            )
            imageViewFavourite.setImageDrawable(drawable)
        }
    }
}
