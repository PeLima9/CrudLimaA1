package RecyclerViewHelper

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import lima.example.crudlimaa1.R

class ViewHolder(view: View): RecyclerView.ViewHolder(view){
    val textView: TextView = view.findViewById(R.id.txtProductoDato)
}