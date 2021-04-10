package uz.texnopos.roomexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*
import uz.texnopos.roomexample.data.SozlikDatabase

class MainActivity : AppCompatActivity() {
    private val adapter = SozlikAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sozlikList.adapter = adapter
        sozlikList.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        val dao = SozlikDatabase.getInstance(this).dao()
        adapter.models = dao.getAllSozlik()
    }
}
