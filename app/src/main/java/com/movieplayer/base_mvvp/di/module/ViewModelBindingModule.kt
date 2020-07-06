package com.movieplayer.base_mvvp.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.movieplayer.base_mvvp.base.ViewModelFactory
import com.movieplayer.base_mvvp.base.ViewModelKey
import com.movieplayer.base_mvvp.ui.activity.movie.PopularMoviesViewModel
import com.movieplayer.base_mvvp.ui.activity.movie_details.MovieDetailsViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelBindingModule {

    @Binds
    @IntoMap
    @ViewModelKey(PopularMoviesViewModel::class)
    internal abstract fun bindPopularMoviesViewModel(viewModel: PopularMoviesViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MovieDetailsViewModel::class)
    internal abstract fun bindMovieDetailsViewModel(viewModel: MovieDetailsViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}