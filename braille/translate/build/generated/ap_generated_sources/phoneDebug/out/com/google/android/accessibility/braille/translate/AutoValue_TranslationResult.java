package com.google.android.accessibility.braille.translate;

import com.google.android.accessibility.braille.interfaces.BrailleWord;
import com.google.common.collect.ImmutableList;
import java.util.List;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_TranslationResult extends TranslationResult {

  private final CharSequence text;

  private final BrailleWord cells;

  private final ImmutableList<Integer> textToBraillePositions;

  private final ImmutableList<Integer> brailleToTextPositions;

  private final Integer cursorBytePosition;

  private AutoValue_TranslationResult(
      CharSequence text,
      BrailleWord cells,
      ImmutableList<Integer> textToBraillePositions,
      ImmutableList<Integer> brailleToTextPositions,
      Integer cursorBytePosition) {
    this.text = text;
    this.cells = cells;
    this.textToBraillePositions = textToBraillePositions;
    this.brailleToTextPositions = brailleToTextPositions;
    this.cursorBytePosition = cursorBytePosition;
  }

  @Override
  public CharSequence text() {
    return text;
  }

  @Override
  public BrailleWord cells() {
    return cells;
  }

  @Override
  public ImmutableList<Integer> textToBraillePositions() {
    return textToBraillePositions;
  }

  @Override
  public ImmutableList<Integer> brailleToTextPositions() {
    return brailleToTextPositions;
  }

  @Override
  public Integer cursorBytePosition() {
    return cursorBytePosition;
  }

  @Override
  public String toString() {
    return "TranslationResult{"
        + "text=" + text + ", "
        + "cells=" + cells + ", "
        + "textToBraillePositions=" + textToBraillePositions + ", "
        + "brailleToTextPositions=" + brailleToTextPositions + ", "
        + "cursorBytePosition=" + cursorBytePosition
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof TranslationResult) {
      TranslationResult that = (TranslationResult) o;
      return this.text.equals(that.text())
          && this.cells.equals(that.cells())
          && this.textToBraillePositions.equals(that.textToBraillePositions())
          && this.brailleToTextPositions.equals(that.brailleToTextPositions())
          && this.cursorBytePosition.equals(that.cursorBytePosition());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= text.hashCode();
    h$ *= 1000003;
    h$ ^= cells.hashCode();
    h$ *= 1000003;
    h$ ^= textToBraillePositions.hashCode();
    h$ *= 1000003;
    h$ ^= brailleToTextPositions.hashCode();
    h$ *= 1000003;
    h$ ^= cursorBytePosition.hashCode();
    return h$;
  }

  static final class Builder extends TranslationResult.Builder {
    private CharSequence text;
    private BrailleWord cells;
    private ImmutableList<Integer> textToBraillePositions;
    private ImmutableList<Integer> brailleToTextPositions;
    private Integer cursorBytePosition;
    Builder() {
    }
    @Override
    public TranslationResult.Builder setText(CharSequence text) {
      if (text == null) {
        throw new NullPointerException("Null text");
      }
      this.text = text;
      return this;
    }
    @Override
    public TranslationResult.Builder setCells(BrailleWord cells) {
      if (cells == null) {
        throw new NullPointerException("Null cells");
      }
      this.cells = cells;
      return this;
    }
    @Override
    public TranslationResult.Builder setTextToBraillePositions(List<Integer> textToBraillePositions) {
      this.textToBraillePositions = ImmutableList.copyOf(textToBraillePositions);
      return this;
    }
    @Override
    public TranslationResult.Builder setBrailleToTextPositions(List<Integer> brailleToTextPositions) {
      this.brailleToTextPositions = ImmutableList.copyOf(brailleToTextPositions);
      return this;
    }
    @Override
    public TranslationResult.Builder setCursorBytePosition(int cursorBytePosition) {
      this.cursorBytePosition = cursorBytePosition;
      return this;
    }
    @Override
    public TranslationResult build() {
      if (this.text == null
          || this.cells == null
          || this.textToBraillePositions == null
          || this.brailleToTextPositions == null
          || this.cursorBytePosition == null) {
        StringBuilder missing = new StringBuilder();
        if (this.text == null) {
          missing.append(" text");
        }
        if (this.cells == null) {
          missing.append(" cells");
        }
        if (this.textToBraillePositions == null) {
          missing.append(" textToBraillePositions");
        }
        if (this.brailleToTextPositions == null) {
          missing.append(" brailleToTextPositions");
        }
        if (this.cursorBytePosition == null) {
          missing.append(" cursorBytePosition");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_TranslationResult(
          this.text,
          this.cells,
          this.textToBraillePositions,
          this.brailleToTextPositions,
          this.cursorBytePosition);
    }
  }

}
