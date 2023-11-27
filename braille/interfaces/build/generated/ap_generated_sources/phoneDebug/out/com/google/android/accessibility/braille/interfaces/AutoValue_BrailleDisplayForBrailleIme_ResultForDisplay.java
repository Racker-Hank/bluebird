package com.google.android.accessibility.braille.interfaces;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_BrailleDisplayForBrailleIme_ResultForDisplay extends BrailleDisplayForBrailleIme.ResultForDisplay {

  private final CharSequence onScreenText;

  private final SelectionRange textSelection;

  private final BrailleDisplayForBrailleIme.ResultForDisplay.HoldingsInfo holdingsInfo;

  private final boolean isMultiLine;

  private final String hint;

  private final String action;

  private final boolean showPassword;

  private AutoValue_BrailleDisplayForBrailleIme_ResultForDisplay(
      CharSequence onScreenText,
      SelectionRange textSelection,
      BrailleDisplayForBrailleIme.ResultForDisplay.HoldingsInfo holdingsInfo,
      boolean isMultiLine,
      String hint,
      String action,
      boolean showPassword) {
    this.onScreenText = onScreenText;
    this.textSelection = textSelection;
    this.holdingsInfo = holdingsInfo;
    this.isMultiLine = isMultiLine;
    this.hint = hint;
    this.action = action;
    this.showPassword = showPassword;
  }

  @Override
  public CharSequence onScreenText() {
    return onScreenText;
  }

  @Override
  public SelectionRange textSelection() {
    return textSelection;
  }

  @Override
  public BrailleDisplayForBrailleIme.ResultForDisplay.HoldingsInfo holdingsInfo() {
    return holdingsInfo;
  }

  @Override
  public boolean isMultiLine() {
    return isMultiLine;
  }

  @Override
  public String hint() {
    return hint;
  }

  @Override
  public String action() {
    return action;
  }

  @Override
  public boolean showPassword() {
    return showPassword;
  }

  @Override
  public String toString() {
    return "ResultForDisplay{"
        + "onScreenText=" + onScreenText + ", "
        + "textSelection=" + textSelection + ", "
        + "holdingsInfo=" + holdingsInfo + ", "
        + "isMultiLine=" + isMultiLine + ", "
        + "hint=" + hint + ", "
        + "action=" + action + ", "
        + "showPassword=" + showPassword
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BrailleDisplayForBrailleIme.ResultForDisplay) {
      BrailleDisplayForBrailleIme.ResultForDisplay that = (BrailleDisplayForBrailleIme.ResultForDisplay) o;
      return this.onScreenText.equals(that.onScreenText())
          && this.textSelection.equals(that.textSelection())
          && this.holdingsInfo.equals(that.holdingsInfo())
          && this.isMultiLine == that.isMultiLine()
          && this.hint.equals(that.hint())
          && this.action.equals(that.action())
          && this.showPassword == that.showPassword();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= onScreenText.hashCode();
    h$ *= 1000003;
    h$ ^= textSelection.hashCode();
    h$ *= 1000003;
    h$ ^= holdingsInfo.hashCode();
    h$ *= 1000003;
    h$ ^= isMultiLine ? 1231 : 1237;
    h$ *= 1000003;
    h$ ^= hint.hashCode();
    h$ *= 1000003;
    h$ ^= action.hashCode();
    h$ *= 1000003;
    h$ ^= showPassword ? 1231 : 1237;
    return h$;
  }

  static final class Builder extends BrailleDisplayForBrailleIme.ResultForDisplay.Builder {
    private CharSequence onScreenText;
    private SelectionRange textSelection;
    private BrailleDisplayForBrailleIme.ResultForDisplay.HoldingsInfo holdingsInfo;
    private Boolean isMultiLine;
    private String hint;
    private String action;
    private Boolean showPassword;
    Builder() {
    }
    @Override
    public BrailleDisplayForBrailleIme.ResultForDisplay.Builder setOnScreenText(CharSequence onScreenText) {
      if (onScreenText == null) {
        throw new NullPointerException("Null onScreenText");
      }
      this.onScreenText = onScreenText;
      return this;
    }
    @Override
    public BrailleDisplayForBrailleIme.ResultForDisplay.Builder setTextSelection(SelectionRange textSelection) {
      if (textSelection == null) {
        throw new NullPointerException("Null textSelection");
      }
      this.textSelection = textSelection;
      return this;
    }
    @Override
    public BrailleDisplayForBrailleIme.ResultForDisplay.Builder setHoldingsInfo(BrailleDisplayForBrailleIme.ResultForDisplay.HoldingsInfo holdingsInfo) {
      if (holdingsInfo == null) {
        throw new NullPointerException("Null holdingsInfo");
      }
      this.holdingsInfo = holdingsInfo;
      return this;
    }
    @Override
    public BrailleDisplayForBrailleIme.ResultForDisplay.Builder setIsMultiLine(boolean isMultiLine) {
      this.isMultiLine = isMultiLine;
      return this;
    }
    @Override
    public BrailleDisplayForBrailleIme.ResultForDisplay.Builder setHint(String hint) {
      if (hint == null) {
        throw new NullPointerException("Null hint");
      }
      this.hint = hint;
      return this;
    }
    @Override
    public BrailleDisplayForBrailleIme.ResultForDisplay.Builder setAction(String action) {
      if (action == null) {
        throw new NullPointerException("Null action");
      }
      this.action = action;
      return this;
    }
    @Override
    public BrailleDisplayForBrailleIme.ResultForDisplay.Builder setShowPassword(boolean showPassword) {
      this.showPassword = showPassword;
      return this;
    }
    @Override
    public BrailleDisplayForBrailleIme.ResultForDisplay build() {
      if (this.onScreenText == null
          || this.textSelection == null
          || this.holdingsInfo == null
          || this.isMultiLine == null
          || this.hint == null
          || this.action == null
          || this.showPassword == null) {
        StringBuilder missing = new StringBuilder();
        if (this.onScreenText == null) {
          missing.append(" onScreenText");
        }
        if (this.textSelection == null) {
          missing.append(" textSelection");
        }
        if (this.holdingsInfo == null) {
          missing.append(" holdingsInfo");
        }
        if (this.isMultiLine == null) {
          missing.append(" isMultiLine");
        }
        if (this.hint == null) {
          missing.append(" hint");
        }
        if (this.action == null) {
          missing.append(" action");
        }
        if (this.showPassword == null) {
          missing.append(" showPassword");
        }
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_BrailleDisplayForBrailleIme_ResultForDisplay(
          this.onScreenText,
          this.textSelection,
          this.holdingsInfo,
          this.isMultiLine,
          this.hint,
          this.action,
          this.showPassword);
    }
  }

}
