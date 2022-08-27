package com.example.lunchtray.ui.order

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.lunchtray.R

public class AccompanimentMenuFragmentDirections private constructor() {
  public companion object {
    public fun actionAccompanimentMenuFragment2ToCheckoutFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_accompanimentMenuFragment2_to_checkoutFragment)

    public fun actionAccompanimentMenuFragment2ToStartOrderFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_accompanimentMenuFragment2_to_startOrderFragment)
  }
}
