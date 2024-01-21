/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.model.site

/**
 * SiteView: Home
 */
data class SiteViewHome(
  override val title: String = "sidd88 :: Home"
): SiteViewValue() {

  /**
   * SiteViewHome companion object
   */
  companion object {
    fun build() = SiteViewHome()
  }
}
