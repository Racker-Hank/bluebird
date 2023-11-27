package com.google.android.accessibility.talkback;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Feedback_ServiceFlag extends Feedback.ServiceFlag {

  private final Feedback.ServiceFlag.Action action;

  private final int flag;

  AutoValue_Feedback_ServiceFlag(
      Feedback.ServiceFlag.Action action,
      int flag) {
    if (action == null) {
      throw new NullPointerException("Null action");
    }
    this.action = action;
    this.flag = flag;
  }

  @Override
  public Feedback.ServiceFlag.Action action() {
    return action;
  }

  @Override
  public int flag() {
    return flag;
  }

  @Override
  public String toString() {
    return "ServiceFlag{"
        + "action=" + action + ", "
        + "flag=" + flag
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Feedback.ServiceFlag) {
      Feedback.ServiceFlag that = (Feedback.ServiceFlag) o;
      return this.action.equals(that.action())
          && this.flag == that.flag();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= action.hashCode();
    h$ *= 1000003;
    h$ ^= flag;
    return h$;
  }

}
