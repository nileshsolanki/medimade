package com.nilesh.medimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.chyrta.onboarder.OnboarderActivity;
import com.chyrta.onboarder.OnboarderPage;

import java.util.ArrayList;
import java.util.List;

public class OnboardingActivity extends OnboarderActivity {

    List<OnboarderPage> onboarderPages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.onboarding_activity);


        onboarderPages = new ArrayList<>();

        // Create your pages
        OnboarderPage completeInfoPage = new OnboarderPage("Complete Medicine Information", "Have exhaustive medicine information at your fingertips", R.drawable.complete_info);
        OnboarderPage alternativesPage = new OnboarderPage("Alternatives", "Suggestions of alternates with same compositions. Alternates can save you upto 90%", R.drawable.alternatives);
        OnboarderPage confidencePage = new OnboarderPage("Trust Your Medicine", "Knowing how your medicine works and it's targets will increase your cocnfidence towards your meds", R.drawable.confidence);

        // You can define title and description colors (by default white)
        completeInfoPage.setTitleColor(R.color.primary_text);
        completeInfoPage.setDescriptionColor(R.color.secondary_text);
        completeInfoPage.setBackgroundColor(android.R.color.white);

        alternativesPage.setTitleColor(R.color.primary_text);
        alternativesPage.setDescriptionColor(R.color.secondary_text);
        alternativesPage.setBackgroundColor(android.R.color.white);

        confidencePage.setTitleColor(R.color.primary_text);
        confidencePage.setDescriptionColor(R.color.secondary_text);
        confidencePage.setBackgroundColor(android.R.color.white);


        // Add your pages to the list
        onboarderPages.add(completeInfoPage);
        onboarderPages.add(alternativesPage);
        onboarderPages.add(confidencePage);

        // And pass your pages to 'setOnboardPagesReady' method
        setOnboardPagesReady(onboarderPages);

        shouldDarkenButtonsLayout(true);
        shouldUseFloatingActionButton(true);
        setActiveIndicatorColor(R.color.primary_light);
    }


    @Override
    public void onFinishButtonPressed() {
        startActivity(new Intent(this, LoginActivity.class));

    }
}
