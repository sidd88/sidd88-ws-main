/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

package me.sidd88.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

/**
 * Custom exception: Resource not found
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
data class ResourceNotFoundException(
  val resourceName: String,
  val fieldName:    String,
  val fieldValue:   Long
): RuntimeException("$resourceName not found with $fieldName: $fieldValue")