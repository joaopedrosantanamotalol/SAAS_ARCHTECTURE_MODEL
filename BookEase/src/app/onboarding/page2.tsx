import { Images } from "@/assets/images";
import { router } from "expo-router";
import { Button, ImageBackground, StyleSheet, View } from "react-native";

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  image: {
    flex: 1,
    justifyContent: "center",
  },
});

export default function Page2() {
    return (
     <ImageBackground
                source={
                    Images.onboarding2
                }
            style={{flex:1}}
            >
    <View
            style={{
                flex: 1,
                justifyContent: 'center',
                alignItems: 'center',

        }}
        >



            <Button
                title="Proximo"
                onPress={() => router.push("/onboarding/page3")}
            />

            </View>
            </ImageBackground>

    );
}
