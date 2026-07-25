import { styles } from "./styles";

import { ImageBackground, Text, View } from "react-native";

type Props = {
  image: any;
  titleWhite: string;
  titleYellow: string;
  currentPage: 1 | 2 | 3;
};

export function Pagination({
  image,
  titleWhite,
  titleYellow,
  currentPage,
}: Props) {
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
