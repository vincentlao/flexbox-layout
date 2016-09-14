/*
 * Copyright 2016 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.flexbox;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Fake implementation of {@link FlexContainer}.
 */
public class FakeFlexContainer implements FlexContainer {

    List<View> mViews = new ArrayList<>();

    List<FlexLine> mFlexLines = new ArrayList<>();

    @FlexDirection
    int mFlexDirection = FlexDirection.ROW;

    @FlexWrap
    int mFlexWrap = FlexWrap.WRAP;

    @JustifyContent
    int mJustifyContent = JustifyContent.FLEX_START;

    @AlignItems
    int mAlignItems = AlignItems.STRETCH;

    @AlignContent
    int mAlignContent = AlignContent.STRETCH;

    int mPaddingTop = 0;

    int mPaddingLeft = 0;

    int mPaddingRight = 0;

    int mPaddingBottom = 0;

    @Override
    public int getChildCount() {
        return mViews.size();
    }

    @Override
    public View getChildAt(int index) {
        return mViews.get(index);
    }

    @Override
    public View getReorderedChildAt(int index) {
        return mViews.get(index);
    }

    @Override
    public void addView(View view) {
        mViews.add(view);
    }

    @Override
    public void addView(View view, int index) {
        mViews.add(index, view);
    }

    @Override
    public void removeAllViews() {
        mViews.clear();
    }

    @Override
    public void removeViewAt(int index) {
        mViews.remove(index);
    }

    @Override
    public int getFlexDirection() {
        return mFlexDirection;
    }

    @Override
    public void setFlexDirection(@FlexDirection int flexDirection) {
        mFlexDirection = flexDirection;
    }

    @Override
    public int getFlexWrap() {
        return mFlexWrap;
    }

    @Override
    public void setFlexWrap(@FlexWrap int flexWrap) {
        mFlexWrap = flexWrap;
    }

    @Override
    public int getJustifyContent() {
        return mJustifyContent;
    }

    @Override
    public void setJustifyContent(@JustifyContent int justifyContent) {
        mJustifyContent = justifyContent;
    }

    @Override
    public int getAlignContent() {
        return mAlignContent;
    }

    @Override
    public void setAlignContent(@AlignContent int alignContent) {
        mAlignContent = alignContent;
    }

    @Override
    public int getAlignItems() {
        return mAlignItems;
    }

    @Override
    public void setAlignItems(@AlignItems int alignItems) {
        mAlignItems = alignItems;
    }

    @Override
    public List<FlexLine> getFlexLines() {
        return mFlexLines;
    }

    @Override
    public int getDecorationLength(int childAbsoluteIndex, int childRelativeIndexInFlexLine,
            FlexItem flexItem) {
        return 0;
    }

    @Override
    public int getPaddingTop() {
        return mPaddingTop;
    }

    @Override
    public int getPaddingLeft() {
        return mPaddingLeft;
    }

    @Override
    public int getPaddingRight() {
        return mPaddingRight;
    }

    @Override
    public int getPaddingBottom() {
        return mPaddingBottom;
    }

    @Override
    public int getHorizontalChildMeasureSpec(int widthSpec, int padding, int childDimension) {
        return 0;
    }

    @Override
    public int getVerticalChildMeasureSpec(int heightSpec, int padding, int childDimension) {
        return 0;
    }

    @Override
    public void onNewFlexItemAdded(int childAbsoluteIndex, int childRelativeIndexInFlexLine,
            FlexLine flexLine) {

    }

    @Override
    public void onNewFlexLineAdded(FlexLine flexLine) {

    }
}
