package com.coderus.codingchallenge.rocketlaunchlist;

import java.lang.System;

/**
 * ListAdapter class for the Recycler view that displays a list of [RocketLaunch] objects.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0015B\u0017\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u0014\u0010\u0012\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/coderus/codingchallenge/rocketlaunchlist/RocketLaunchListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/coderus/codingchallenge/objectmodel/RocketLaunch;", "Lcom/coderus/codingchallenge/rocketlaunchlist/RocketLaunchListAdapter$ListItemViewHolder;", "context", "Landroid/content/Context;", "onClickListener", "Landroid/view/View$OnClickListener;", "(Landroid/content/Context;Landroid/view/View$OnClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "list", "", "ListItemViewHolder", "app_debug"})
public final class RocketLaunchListAdapter extends androidx.recyclerview.widget.ListAdapter<com.coderus.codingchallenge.objectmodel.RocketLaunch, com.coderus.codingchallenge.rocketlaunchlist.RocketLaunchListAdapter.ListItemViewHolder> {
    private final android.content.Context context = null;
    private final android.view.View.OnClickListener onClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.coderus.codingchallenge.rocketlaunchlist.RocketLaunchListAdapter.ListItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.coderus.codingchallenge.rocketlaunchlist.RocketLaunchListAdapter.ListItemViewHolder holder, int position) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.coderus.codingchallenge.objectmodel.RocketLaunch> list) {
    }
    
    public RocketLaunchListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener onClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/coderus/codingchallenge/rocketlaunchlist/RocketLaunchListAdapter$ListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listItemView", "Lcom/coderus/codingchallenge/rocketlaunchlist/ListItemView;", "(Lcom/coderus/codingchallenge/rocketlaunchlist/RocketLaunchListAdapter;Lcom/coderus/codingchallenge/rocketlaunchlist/ListItemView;)V", "getListItemView", "()Lcom/coderus/codingchallenge/rocketlaunchlist/ListItemView;", "app_debug"})
    public final class ListItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.coderus.codingchallenge.rocketlaunchlist.ListItemView listItemView = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.coderus.codingchallenge.rocketlaunchlist.ListItemView getListItemView() {
            return null;
        }
        
        public ListItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.coderus.codingchallenge.rocketlaunchlist.ListItemView listItemView) {
            super(null);
        }
    }
}