package com.google.android.accessibility.talkback;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Feedback_Sound extends Feedback.Sound {

  private final int resourceId;

  private final float rate;

  private final float volume;

  private final long separationMillisec;

  AutoValue_Feedback_Sound(
      int resourceId,
      float rate,
      float volume,
      long separationMillisec) {
    this.resourceId = resourceId;
    this.rate = rate;
    this.volume = volume;
    this.separationMillisec = separationMillisec;
  }

  @Override
  public int resourceId() {
    return resourceId;
  }

  @Override
  public float rate() {
    return rate;
  }

  @Override
  public float volume() {
    return volume;
  }

  @Override
  public long separationMillisec() {
    return separationMillisec;
  }

  @Override
  public String toString() {
    return "Sound{"
        + "resourceId=" + resourceId + ", "
        + "rate=" + rate + ", "
        + "volume=" + volume + ", "
        + "separationMillisec=" + separationMillisec
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Feedback.Sound) {
      Feedback.Sound that = (Feedback.Sound) o;
      return this.resourceId == that.resourceId()
          && Float.floatToIntBits(this.rate) == Float.floatToIntBits(that.rate())
          && Float.floatToIntBits(this.volume) == Float.floatToIntBits(that.volume())
          && this.separationMillisec == that.separationMillisec();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= resourceId;
    h$ *= 1000003;
    h$ ^= Float.floatToIntBits(rate);
    h$ *= 1000003;
    h$ ^= Float.floatToIntBits(volume);
    h$ *= 1000003;
    h$ ^= (int) ((separationMillisec >>> 32) ^ separationMillisec);
    return h$;
  }

}
