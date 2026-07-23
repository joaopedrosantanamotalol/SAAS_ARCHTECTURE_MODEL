import { ImageBackground, Text, View } from "react-native";
import { styles } from "./styles"

type Props = {
  image: any;
  titleWhite: string;
  titleYellow: string;
};

export function OnboardingPage({ image, titleWhite, titleYellow }: Props) {
  return (
    <ImageBackground
      source={image}
      style={styles.background}
      resizeMode="cover"
    >
      <View style={styles.overlay}>
        <View>
          <Text style={styles.titleWhite}>{titleWhite}</Text>
          <Text style={styles.titleYellow}>{titleYellow}</Text>
        </View>
      </View>
    </ImageBackground>
  );
}
