import { View, Image, Text } from "react-native-reanimated/lib/typescript/Animated";

type Props = {
    image: any,
    titleWhite: string,
};

export function EnviromentButton({
    image,
    titleWhite,
}: Props){
    return (
        <View>
            <Image source={image}></Image>
            <Text>{titleWhite}</Text>
        </View>
    );
}