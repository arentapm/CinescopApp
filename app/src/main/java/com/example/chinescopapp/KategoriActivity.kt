package com.example.chinescopapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
import missing.namespace.R

class KategoriActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener =
        OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    loadFragment(MenuFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.menu_kategori -> {
                    loadFragment(KategoriFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.menu_profil -> {
                    loadFragment(ProfilFragment())
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        // Secara default, tampilkan halaman Menu saat aktivitas dibuka
        loadFragment(MenuFragment())
    }

    private fun loadFragment(fragment: Fragment) {
        // Ganti fragment di dalam container
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}

class ProfilFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout for this fragment
        setContentView(R.layout.fragment_profil)
    }

    private fun setContentView(fragmentProfil: Any) {
        TODO("Not yet implemented")
    }
}

class MenuFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout for this fragment
        setContentView(R.layout.fragment_menu)
    }

    private fun setContentView(fragmentMenu: Any) {
        TODO("Not yet implemented")
    }
}

class KategoriFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout for this fragment
        setContentView(R.layout.fragment_kategori)
    }
}
