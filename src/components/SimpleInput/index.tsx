import { View, TextInput } from "react-native";
import { style } from "./style";

type Props = {
    titleWhite: string,
};

export function SimpleCard({
    titleWhite,
}: Props){
    return (
        
        <View style={style.canvas_body}>
            <TextInput
             style={style.input}
             placeholderTextColor={"#FFFFFF"}
             placeholder={titleWhite}
             />
        </View>
    );
}