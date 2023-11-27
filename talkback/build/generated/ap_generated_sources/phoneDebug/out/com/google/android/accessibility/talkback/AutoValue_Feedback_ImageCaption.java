package com.google.android.accessibility.talkback;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import javax.annotation.Generated;
import org.checkerframework.checker.nullness.qual.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Feedback_ImageCaption extends Feedback.ImageCaption {

  private final Feedback.ImageCaption.Action action;

  private final @Nullable AccessibilityNodeInfoCompat target;

  private final boolean userRequested;

  private AutoValue_Feedback_ImageCaption(
      Feedback.ImageCaption.Action action,
      @Nullable AccessibilityNodeInfoCompat target,
      boolean userRequested) {
    this.action = action;
    this.target = target;
    this.userRequested = userRequested;
  }

  @Override
  public Feedback.ImageCaption.Action action() {
    return action;
  }

  @Override
  public @Nullable AccessibilityNodeInfoCompat target() {
    return target;
  }

  @Override
  public boolean userRequested() {
    return userRequested;
  }

  @Override
  public String toString() {
    return "ImageCaption{"
        + "action=" + action + ", "
        + "target=" + target + ", "
        + "userRequested=" + userRequested
        + "}";
  }

  @Override
  public boolean equals(@Nullable Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Feedback.ImageCaption) {
      Feedback.ImageCaption that = (Feedback.ImageCaption) o;
      return this.action.equals(that.action())
          && (this.target == null ? that.target() == null : this.target.equals(that.target()))
          && this.userRequested == that.userRequested();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= action.hashCode();
    h$ *= 1000003;
    h$ ^= (target == null) ? 0 : target.hashCode();
    h$ *= 1000003;
    h$ ^= userRequested ? 1231 : 1237;
    return h$;
  }

  static final class Builder extends Feedback.ImageCaption.Builder {
    private Feedback.ImageCaption.Action action;
    private @Nullable AccessibilityNodeInfoCompat target;
    private Boolean userRequested;
    Builder() {
    }
    @Override
    public Feedback.ImageCaption.Builder setAction(Feedback.ImageCaption.Action action) {
      if (action == null) {
        throw new NullPointerException("Null action");
      }
      this.action = action;
      return this;
    }
    @Override
    public Feedback.ImageCaption.Builder setTarget(@Nullable AccessibilityNodeInfoCompat target) {
      this.target = target;
      return this;
    }
    @Override
    AccessibilityNodeInfoCompat target() {
      return target;
    }
    @Override
    public Feedback.ImageCaption.Builder setUserRequested(boolean userRequested) {
      this.userRequested = userRequested;
      return this;
    }
    @Override
    public Feedback.ImageCaption build() {
      if (this.action == null
          || this.userRequested == null) {
        StringBuilder missing = new StringBuilder();
        if (this.action == null) {
          missing.append(" action");
        }
        if (this.userRequested == null) {
          missing.append(" userRequested");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Feedback_ImageCaption(
          this.action,
          this.target,
          this.userRequested);
    }
  }

}
