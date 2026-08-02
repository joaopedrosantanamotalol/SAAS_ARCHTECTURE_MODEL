import { View, Image, Text } from "react-native";
import { style } from "./style";

type Props = {
    image?: any,
    titleWhite: string,
};

export function EnviromentButton({
    image,
    titleWhite,
}: Props){
    return (
        
        <View style={style.canvas_body}>
            <Image source={image} style={style.image_button}></Image>
            <Text style={style.titulo}>{titleWhite}</Text>
        </View>
    );
}