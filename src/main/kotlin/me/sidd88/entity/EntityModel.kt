/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.entity

import java.io.Serializable
import java.time.LocalDateTime

/**
 * Base Entity definition
 */
abstract class EntityModel : Serializable {

  /**
   * The ID of entity
   */
  abstract val id: Long?

  /**
   * The last update date and time of Entity
   */
  abstract val updatedAt: LocalDateTime

  /**
   * The created date and time of Entity
   */
  abstract val createdAt: LocalDateTime
}