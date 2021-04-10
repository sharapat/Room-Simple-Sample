package uz.texnopos.roomexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*
import uz.texnopos.roomexample.data.Sozlik

class SozlikAdapter : RecyclerView.Adapter<SozlikAdapter.SozlikViewHolder>() {

    var models: List<Sozlik> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    inner class SozlikViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun populateModel(model: Sozlik) {
            itemView.tvKar.text = model.kar
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SozlikViewHolder {
        return SozlikViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: SozlikViewHolder, position: Int) {
        holder.populateModel(models[position])
    }

    override fun getItemCount() = models.size
}