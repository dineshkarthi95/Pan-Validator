package com.dineshworkspace.panvalidator.di

import com.dineshworkspace.panvalidator.validator.PanCardValidator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @[Provides Singleton]
    fun providesPanCardValidator(): PanCardValidator {
        return PanCardValidator()
    }

}