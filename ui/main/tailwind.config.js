/*
 * Copyright (c) 2024 sidd88. All Rights Reserved.
 *
 * For the full copyright and license information,
 * please view the LICENSE file that was distributed with this source code.
 */

/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    '../../src/main/resources/templates/**/*.html'
  ],
  theme: {
    extend: {
      width: {
        'content': '1024px'
      }
    },
  }
}