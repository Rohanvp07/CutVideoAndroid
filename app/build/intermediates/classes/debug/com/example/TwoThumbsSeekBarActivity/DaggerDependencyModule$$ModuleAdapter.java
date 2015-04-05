// Code generated by dagger-compiler.  Do not edit.
package com.example.TwoThumbsSeekBarActivity;

import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class DaggerDependencyModule$$ModuleAdapter extends ModuleAdapter<DaggerDependencyModule> {
  private static final String[] INJECTS = { "members/com.example.TwoThumbsSeekBarActivity.MyActivity", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { };

  public DaggerDependencyModule$$ModuleAdapter() {
    super(com.example.TwoThumbsSeekBarActivity.DaggerDependencyModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, DaggerDependencyModule module) {
    bindings.contributeProvidesBinding("com.github.hiteshsondhi88.libffmpeg.FFmpeg", new ProvideFFmpegProvidesAdapter(module));
  }

  /**
   * A {@code Binding<com.github.hiteshsondhi88.libffmpeg.FFmpeg>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<com.github.hiteshsondhi88.libffmpeg.FFmpeg>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideFFmpegProvidesAdapter extends ProvidesBinding<com.github.hiteshsondhi88.libffmpeg.FFmpeg>
      implements Provider<com.github.hiteshsondhi88.libffmpeg.FFmpeg> {
    private final DaggerDependencyModule module;

    public ProvideFFmpegProvidesAdapter(DaggerDependencyModule module) {
      super("com.github.hiteshsondhi88.libffmpeg.FFmpeg", IS_SINGLETON, "com.example.TwoThumbsSeekBarActivity.DaggerDependencyModule", "provideFFmpeg");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<com.github.hiteshsondhi88.libffmpeg.FFmpeg>}.
     */
    @Override
    public com.github.hiteshsondhi88.libffmpeg.FFmpeg get() {
      return module.provideFFmpeg();
    }
  }
}