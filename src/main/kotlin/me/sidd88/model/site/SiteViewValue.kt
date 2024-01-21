/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.model.site

/**
 * Global navigation menu definition
 */
enum class GlobalMenu(
  val label: String,
  val link:  String
) {
  HOME      ("Home",       "/"          ),
  POSTS     ("Posts",      "/posts"     ),
  CATEGORIES("Categories", "/categories"),
  CONTACT   ("Contact",    "/contact"   ),
  ABOUT     ("About Me",   "/about"     ),
}

/**
 * Base SiteViewValue
 */
abstract class SiteViewValue {

  // -- Abstract Properties
  // ---------------------------------------------------------------------------------

  /**
   * Page title
   */
  abstract val title: String

  // -- Properties
  // ---------------------------------------------------------------------------------

  /**
   * Global navigation menu list
   */
  val menuItems = GlobalMenu.entries.toList()

  // -- Methods
  // ---------------------------------------------------------------------------------

  /**
   * Check the active Global MenuItem
   */
  fun isActiveMenu(item: GlobalMenu) = when(item) {
    GlobalMenu.HOME       -> this.javaClass.simpleName == "SiteViewHome"
    GlobalMenu.POSTS      -> this.javaClass.simpleName == "SiteViewPost"
    GlobalMenu.CATEGORIES -> false
    GlobalMenu.CONTACT    -> false
    GlobalMenu.ABOUT      -> false
  }
}