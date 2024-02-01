/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.entity

import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalDateTime

/**
 * Entity definition: Post
 */
@Entity
@Table(name = "post")
data class Post(
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  override val id: Long? = null,

  @Column(length = 255, nullable = false)
  val title: String,

  @Column(columnDefinition = "TEXT")
  val description: String? = null,

  @Column(columnDefinition = "TEXT")
  val content: String? = null,

  val publishAt: LocalDate? = null,

  @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
  override val updatedAt: LocalDateTime,

  @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
  override val createdAt: LocalDateTime
) : EntityModel()