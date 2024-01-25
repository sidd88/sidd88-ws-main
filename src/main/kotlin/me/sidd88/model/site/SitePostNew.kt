/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.model.site

/**
 * SiteView: Post new
 */
data class SiteViewPostNew(
  override val title: String = "sidd88 :: New Posts"
): SiteViewValue() {

  /**
   * SiteViewPostNew companion object
   */
  companion object {
    fun build() = SiteViewPostNew()
  }
}
