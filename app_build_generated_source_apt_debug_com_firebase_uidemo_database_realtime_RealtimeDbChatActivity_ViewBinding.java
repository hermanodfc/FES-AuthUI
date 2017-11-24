// Generated code from Butter Knife. Do not modify!
package com.firebase.uidemo.database.realtime;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.firebase.uidemo.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RealtimeDbChatActivity_ViewBinding implements Unbinder {
  private RealtimeDbChatActivity target;

  private View view2131230960;

  @UiThread
  public RealtimeDbChatActivity_ViewBinding(RealtimeDbChatActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RealtimeDbChatActivity_ViewBinding(final RealtimeDbChatActivity target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.messagesList, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.sendButton, "field 'mSendButton' and method 'onSendClick'");
    target.mSendButton = Utils.castView(view, R.id.sendButton, "field 'mSendButton'", Button.class);
    view2131230960 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSendClick();
      }
    });
    target.mMessageEdit = Utils.findRequiredViewAsType(source, R.id.messageEdit, "field 'mMessageEdit'", EditText.class);
    target.mEmptyListMessage = Utils.findRequiredViewAsType(source, R.id.emptyTextView, "field 'mEmptyListMessage'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RealtimeDbChatActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mSendButton = null;
    target.mMessageEdit = null;
    target.mEmptyListMessage = null;

    view2131230960.setOnClickListener(null);
    view2131230960 = null;
  }
}
