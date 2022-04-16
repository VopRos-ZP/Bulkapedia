package com.bulkapedia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bulkapedia.databinding.SetFragmentBinding
import com.bulkapedia.gears.Gear
import com.bulkapedia.sets.Set

class SetFragment (private val set: Set) : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance(set: Set): SetFragment = SetFragment(set)
    }

    private lateinit var bind: SetFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = SetFragmentBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gears = getGears()
        val ivs = getIVs()
        ivs.forEachIndexed { i, iv ->
            iv.setImageResource(gears[i].icon)
        }
    }

    private fun getGears(): List<Gear> = set.gears.map { it.value }

    private fun getIVs(): List<ImageView> = listOf(
        bind.ivHead, bind.ivBody,
        bind.ivArm, bind.ivLeg,
        bind.ivDecor, bind.ivDevice
    )

}