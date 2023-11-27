package com.google.android.accessibility.talkback;

import android.content.res.Configuration;
import javax.annotation.Generated;
import org.checkerframework.checker.nullness.qual.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Feedback_UniversalSearch extends Feedback.UniversalSearch {

  private final Feedback.UniversalSearch.Action action;

  private final boolean screenOn;

  private final @Nullable Configuration config;

  private AutoValue_Feedback_UniversalSearch(
      Feedback.UniversalSearch.Action action,
      boolean screenOn,
      @Nullable Configuration config) {
    this.action = action;
    this.screenOn = screenOn;
    this.config = config;
  }

  @Override
  public Feedback.UniversalSearch.Action action() {
    return action;
  }

  @Override
  public boolean screenOn() {
    return screenOn;
  }

  @Override
  public @Nullable Configuration config() {
    return config;
  }

  @Override
  public String toString() {
    return "UniversalSearch{"
        + "action=" + action + ", "
        + "screenOn=" + screenOn + ", "
        + "config=" + config
        + "}";
  }

  @Override
  public boolean equals(@Nullable Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Feedback.UniversalSearch) {
      Feedback.UniversalSearch that = (Feedback.UniversalSearch) o;
      return this.action.equals(that.action())
          && this.screenOn == that.screenOn()
          && (this.config == null ? that.config() == null : this.config.equals(that.config()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= action.hashCode();
    h$ *= 1000003;
    h$ ^= screenOn ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= (config == null) ? 0 : config.hashCode();
    return h$;
  }

  static final class Builder extends Feedback.UniversalSearch.Builder {
    private Feedback.UniversalSearch.Action action;
    private Boolean screenOn;
    private @Nullable Configuration config;
    Builder() {
    }
    @Override
    public Feedback.UniversalSearch.Builder setAction(Feedback.UniversalSearch.Action action) {
      if (action == null) {
        throw new NullPointerException("Null action");
      }
      this.action = action;
      return this;
    }
    @Override
    public Feedback.UniversalSearch.Builder setScreenOn(boolean screenOn) {
      this.screenOn = screenOn;
      return this;
    }
    @Override
    public Feedback.UniversalSearch.Builder setConfig(@Nullable Configuration config) {
      this.config = config;
      return this;
    }
    @Override
    public Feedback.UniversalSearch build() {
      if (this.action == null
          || this.screenOn == null) {
        StringBuilder missing = new StringBuilder();
        if (this.action == null) {
          missing.append(" action");
        }
        if (this.screenOn == null) {
          missing.append(" screenOn");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Feedback_UniversalSearch(
          this.action,
          this.screenOn,
          this.config);
    }
  }

}
