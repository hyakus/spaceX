package com.coderus.codingchallenge.rocketlaunchlist;

import java.lang.System;

/**
 * Custom view to show a [RocketLaunch] in the list in the list fragment.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/coderus/codingchallenge/rocketlaunchlist/ListItemView;", "Landroidx/cardview/widget/CardView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "launch", "Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "getLaunch", "()Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "setLaunch", "(Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;)V", "launchSuccessText", "Landroid/widget/TextView;", "missionDateText", "missionNameText", "setItem", "", "listItem", "app_debug"})
public final class ListItemView extends androidx.cardview.widget.CardView {
    private final android.widget.TextView missionDateText = null;
    private final android.widget.TextView missionNameText = null;
    private final android.widget.TextView launchSuccessText = null;
    @org.jetbrains.annotations.Nullable()
    private com.coderus.codingchallenge.objectmodel.RocketLaunch launch;
    
    @org.jetbrains.annotations.Nullable()
    public final com.coderus.codingchallenge.objectmodel.RocketLaunch getLaunch() {
        return null;
    }
    
    public final void setLaunch(@org.jetbrains.annotations.Nullable()
    com.coderus.codingchallenge.objectmodel.RocketLaunch p0) {
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    com.coderus.codingchallenge.objectmodel.RocketLaunch listItem) {
    }
    
    public ListItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}