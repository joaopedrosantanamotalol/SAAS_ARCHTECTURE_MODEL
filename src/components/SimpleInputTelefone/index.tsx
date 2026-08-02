import { View, TextInput } from "react-native";
import { style } from "./style";

type Props = {
    titleWhite: string,
};

export function SimpleCardTelefone({
    titleWhite,
}: Props){
    return (
        
        <View style={style.canvas_body}>
            <TextInput
            style={style.input}
            placeholder={titleWhite}
            placeholderTextColor="#FFFFFF"
            keyboardType="phone-pad"
            autoComplete="tel"
            returnKeyType="done"
            />
        </View>
    );
}