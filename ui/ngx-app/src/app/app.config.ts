import { ApplicationConfig, importProvidersFrom } from '@angular/core'
import { provideRouter }                          from '@angular/router'
import { MAT_FORM_FIELD_DEFAULT_OPTIONS }         from '@angular/material/form-field'
import { BrowserAnimationsModule }                from '@angular/platform-browser/animations'

import { routes } from './app.routes'

/**
 * App configuration
 */
export const appConfig: ApplicationConfig = {
  providers: [
    importProvidersFrom(BrowserAnimationsModule),
    provideRouter(routes),
    { provide: MAT_FORM_FIELD_DEFAULT_OPTIONS, useValue: { appearance: 'outline' } }
  ]
}
