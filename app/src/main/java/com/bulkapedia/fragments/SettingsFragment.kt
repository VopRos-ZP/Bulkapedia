package com.bulkapedia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import com.bulkapedia.MainActivity
import com.bulkapedia.R
import com.bulkapedia.databinding.SettingsFragmentBinding
import com.bulkapedia.preference.UserPreferences
import com.bulkapedia.utils.Language

class SettingsFragment (private val main: MainActivity) : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance(main: MainActivity): SettingsFragment = SettingsFragment(main)
    }

    private lateinit var bind: SettingsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = SettingsFragmentBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Инициализация ActionBar
        bind.actionBarInclude.actionBar.title = getString(R.string.settings)
        bind.actionBarInclude.actionBar.setNavigationIcon(R.drawable.menu)
        bind.actionBarInclude.actionBar.setNavigationOnClickListener {
            MainActivity.openDrawer(main.bind.drawerLayout)
        }
        // Инициализируем default значение
        getRadioButtonByLang().isChecked = true
        // Инициализируем слушатель изменения языка
        bind.langRadioGroup.setOnCheckedChangeListener { _, i ->
            val lang = getLangByButtonId(i)
            main.prefs.setLanguage(lang)
            main.getPreferences().edit {
                this.putString(UserPreferences.LANGUAGE, main.prefs.getLanguage())
                this.apply()
            }
            // change language
            Language.update(requireContext(), main.prefs.getLanguage())
            updateView()
        }
    }

    private fun getLangByButtonId(id: Int): String =
        if (id == bind.rbRussian.id) UserPreferences.RU_LANGUAGE
    else UserPreferences.EN_LANGUAGE

    private fun getRadioButtonByLang(): RadioButton =
        if (main.prefs.getLanguage() == UserPreferences.RU_LANGUAGE)
            bind.rbRussian
        else
            bind.rbEnglish

    private fun updateView() {
        // Обновляем NavigationView
        main.updateViews()
        // Обновляем данный фрагмент
        bind.actionBarInclude.actionBar.title = getString(R.string.settings)
        bind.langTv.text = getString(R.string.lang)
        bind.rbRussian.text = getString(R.string.russian_lang)
        bind.rbEnglish.text = getString(R.string.english_lang)
    }

}