import { useState } from "react";
import PagerView from "react-native-pager-view";

import { Images } from "@/assets/images";

import { OnboardingPage } from "@/components/OnboardingPage";
import { Pagination } from "@/components/Pagination";

export default function Onboarding() {
  const [page, setPage] = useState(0);

  return (
    <>
      <PagerView
        style={{ flex: 1 }}
        initialPage={0}
        onPageSelected={(e) => {
          setPage(e.nativeEvent.position);
        }}
      >
        <OnboardingPage
          key="1"
          image={Images.onboarding1}
          titleWhite="Build your"
          titleYellow="System"
        />

        <OnboardingPage
          key="2"
          image={Images.onboarding2}
          titleWhite="Put Your"
          titleYellow="PERSONALITY"
        />

        <OnboardingPage
          key="3"
          image={Images.onboarding3}
          titleWhite="Connecting Small"
          titleYellow="Business"
        />
      </PagerView>

      <Pagination page={page} />
    </>
  );
}
