// Generated by view binder compiler. Do not edit!
package com.coderus.codingchallenge.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.coderus.codingchallenge.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDetailBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView details;

  @NonNull
  public final TextView detailsValue;

  @NonNull
  public final TextView flightNumber;

  @NonNull
  public final TextView flightNumberValue;

  @NonNull
  public final TextView launchDateUTC;

  @NonNull
  public final TextView launchDateUTCValue;

  @NonNull
  public final TextView launchSuccess;

  @NonNull
  public final TextView launchSuccessValue;

  @NonNull
  public final TextView missionName;

  private FragmentDetailBinding(@NonNull ConstraintLayout rootView, @NonNull TextView details,
      @NonNull TextView detailsValue, @NonNull TextView flightNumber,
      @NonNull TextView flightNumberValue, @NonNull TextView launchDateUTC,
      @NonNull TextView launchDateUTCValue, @NonNull TextView launchSuccess,
      @NonNull TextView launchSuccessValue, @NonNull TextView missionName) {
    this.rootView = rootView;
    this.details = details;
    this.detailsValue = detailsValue;
    this.flightNumber = flightNumber;
    this.flightNumberValue = flightNumberValue;
    this.launchDateUTC = launchDateUTC;
    this.launchDateUTCValue = launchDateUTCValue;
    this.launchSuccess = launchSuccess;
    this.launchSuccessValue = launchSuccessValue;
    this.missionName = missionName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.details;
      TextView details = rootView.findViewById(id);
      if (details == null) {
        break missingId;
      }

      id = R.id.detailsValue;
      TextView detailsValue = rootView.findViewById(id);
      if (detailsValue == null) {
        break missingId;
      }

      id = R.id.flightNumber;
      TextView flightNumber = rootView.findViewById(id);
      if (flightNumber == null) {
        break missingId;
      }

      id = R.id.flightNumberValue;
      TextView flightNumberValue = rootView.findViewById(id);
      if (flightNumberValue == null) {
        break missingId;
      }

      id = R.id.launchDateUTC;
      TextView launchDateUTC = rootView.findViewById(id);
      if (launchDateUTC == null) {
        break missingId;
      }

      id = R.id.launchDateUTCValue;
      TextView launchDateUTCValue = rootView.findViewById(id);
      if (launchDateUTCValue == null) {
        break missingId;
      }

      id = R.id.launchSuccess;
      TextView launchSuccess = rootView.findViewById(id);
      if (launchSuccess == null) {
        break missingId;
      }

      id = R.id.launchSuccessValue;
      TextView launchSuccessValue = rootView.findViewById(id);
      if (launchSuccessValue == null) {
        break missingId;
      }

      id = R.id.missionName;
      TextView missionName = rootView.findViewById(id);
      if (missionName == null) {
        break missingId;
      }

      return new FragmentDetailBinding((ConstraintLayout) rootView, details, detailsValue,
          flightNumber, flightNumberValue, launchDateUTC, launchDateUTCValue, launchSuccess,
          launchSuccessValue, missionName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}