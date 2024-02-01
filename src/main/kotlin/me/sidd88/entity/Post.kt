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
  val id: Long,

  @Column(name = "title", length = 255, nullable = false)
  val title: String,

  @Column(name = "description", columnDefinition = "TEXT")
  val description: String,

  @Column(name = "description", columnDefinition = "TEXT")
  val content: String,

  @Column(name = "published_at")
  @Temporal(TemporalType.DATE)
  val publishAt: LocalDate,

  @Column(name = "updated_at")
  @Temporal(TemporalType.TIMESTAMP)
  @Creation
  val updatedAt: LocalDateTime,

  @Column(name = "created_at")
  val createdAt: LocalDateTime
)